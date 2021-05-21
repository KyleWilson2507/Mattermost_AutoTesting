<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>API_SignUp</name>
   <tag></tag>
   <elementGuidId>fbaa49b1-51e0-4fcc-8252-00a239c0be2d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;email\&quot;: \&quot;abcxyzhuykhoi@gmail.com\&quot;,\n  \&quot;username\&quot;: \&quot;abchuykhoi\&quot;,\n  \&quot;first_name\&quot;: \&quot;abc\&quot;,\n  \&quot;last_name\&quot;: \&quot;string\&quot;,\n  \&quot;nickname\&quot;: \&quot;string\&quot;,\n  \&quot;password\&quot;: \&quot;string\&quot;,\n  \&quot;notify_props\&quot;: {\n    \&quot;email\&quot;: true,\n    \&quot;push\&quot;: \&quot;string\&quot;,\n    \&quot;desktop\&quot;: \&quot;string\&quot;,\n    \&quot;desktop_sound\&quot;: true,\n    \&quot;mention_keys\&quot;: \&quot;string\&quot;,\n    \&quot;channel\&quot;: true,\n    \&quot;first_name\&quot;: true\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://mattermostwebapp.herokuapp.com/api/v4/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
