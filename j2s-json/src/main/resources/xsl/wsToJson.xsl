<?xml version="1.0"?>
<xsl:stylesheet version="1.0" 
              xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
              xmlns:fn="http://www.w3.org/2005/xpath-functions"
              xmlns:xs="http://www.w3.org/2001/XMLSchema"
              xmlns:ws="http://tempuri.org/"
              exclude-result-prefixes="xsl fn xs ws">

  <xsl:template match="text()"/>

  <xsl:template match="/">
     <JParty>
       <jsonId><xsl:value-of select="ws:XParty/ws:xmlId"/></jsonId>
       <jsonFirstName><xsl:value-of select="ws:XParty/ws:xmlGivenName"/></jsonFirstName>
       <jsonLastName><xsl:value-of select="ws:XParty/ws:xmlSurname"/></jsonLastName>
     </JParty>
  </xsl:template>
</xsl:stylesheet>
