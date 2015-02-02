<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
   
   
   <!-- book 템플레이트 툴 -->
    <xml:template match="book">
        <tr>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="author"/></td>
        </tr>
    </xml:template>
   
   
   
   
</xsl:stylesheet>