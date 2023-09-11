<?xml version="1.0"?>
<xsl:stylesheet version="1.0" 
              xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
              xmlns:fn="http://www.w3.org/2005/xpath-functions"
              xmlns:xs="http://www.w3.org/2001/XMLSchema"
              xmlns:ws="http://tempuri.org/"
              exclude-result-prefixes="xsl fn xs">

  <xsl:template match="text()"/>

  <xsl:template match="/">
     <ws:XParty>
       <ws:xmlId><xsl:value-of select="JParty/jsonId"/></ws:xmlId>
       <ws:xmlGivenName><xsl:value-of select="JParty/jsonFirstName"/></ws:xmlGivenName>
       <ws:xmlSurname><xsl:value-of select="JParty/jsonLastName"/></ws:xmlSurname>
     </ws:XParty>
  </xsl:template>
</xsl:stylesheet>
