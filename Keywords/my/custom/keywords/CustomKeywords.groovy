package my.custom.keywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class CaptchaSolver {

	@Keyword
	def solveCaptcha(String imagePath) {
		def apiKey = 'YOUR_2CAPTCHA_API_KEY'
		def baseUrl = 'http://2captcha.com/in.php'
		def requestUrl = "${baseUrl}?key=${apiKey}&method=post&file=@${imagePath}&json=1"

		// Upload CAPTCHA image
		def response = WS.sendRequest(findTestObject('Object Repository/Page_Daftar_Sukses/div_reCAPTCHA_recaptcha-checkbox-border', [
			('BaseURL') : requestUrl
		]))

		def responseJson = new JsonSlurper().parseText(response.getResponseBodyContent())
		if (responseJson.status == 1) {
			def requestId = responseJson.request
			// Poll for the result
			def resultUrl = "http://2captcha.com/res.php?key=${apiKey}&action=get&id=${requestId}&json=1"
			def resultResponse = WS.sendRequest(findTestObject('Object Repository/Page_Daftar_Sukses/div_reCAPTCHA_recaptcha-checkbox-border', [
				('BaseURL') : resultUrl
			]))

			def resultJson = new JsonSlurper().parseText(resultResponse.getResponseBodyContent())
			if (resultJson.status == 1) {
				return resultJson.request
			} else {
				throw new Exception("Failed to retrieve CAPTCHA solution: ${resultJson.request}")
			}
		} else {
			throw new Exception("Failed to upload CAPTCHA: ${responseJson.request}")
		}
	}
}
