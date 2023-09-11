<?xml version="1.0"?>
<xsl:stylesheet version="1.0" 
              xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
              xmlns:fn="http://www.w3.org/2005/xpath-functions"
              xmlns:xs="http://www.w3.org/2001/XMLSchema"
              xmlns:ws="http://tempuri.org/"
              exclude-result-prefixes="xsl fn xs">

  <xsl:param name="jsonId"/>

  <xsl:template match="text()"/>

  <xsl:template match="/">
     <ws:BEQuery>
       <ws:xmlId><xsl:value-of select="$jsonId"/></ws:xmlId>
     </ws:BEQuery>
  </xsl:template>
</xsl:stylesheet>
