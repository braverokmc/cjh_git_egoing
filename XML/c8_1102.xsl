<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- 시작 템플릿 룰 -->
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <h2><font color="blue">Our Book's List</font></h2>
                <table border="1" cellspacing="0" width="80%">
                    <tr bgcolor="#FFFF66">
                        <th>title</th>
                        <th>kind</th>
                    </tr>
                    
                    <!-- book 템플릿 룰 적용 -->
                    <xsl:apply-templates select="/booklist/book" />
                    
                </table>
            </body>
        </html>
    </xsl:template>
    
    
    <xsl:template match="book">
        <xsl:choose>
            <xsl:when test="@kind='computer'">
                <tr>
                    <td>
                        <font color="blue"><xsl:value-of select="title"/></font>
                    </td>
                    
                    <td>
                        <font color="blue"><xsl:value-of select="@kind"/></font>
                    </td>
                    
                </tr>
            </xsl:when>
        
            <xsl:when test="@kind='잡지'">
                <tr>
                    <td>
                        <font color="red"><xsl:value-of select="title"/></font>
                    </td>
                    
                    <td>
                        <font color="red"><xsl:value-of select="@kind"/></font>
                    </td>
                    
                </tr>
            </xsl:when>
        
            <xsl:otherwise>
                <tr>
                    <td>
                        <font color="green"><xsl:value-of select="title"/></font>
                    </td>
                    
                    <td>
                        <font color="green"><xsl:value-of select="@kind"/></font>
                    </td>
                    
                </tr>
            </xsl:otherwise>
        
        
      
        </xsl:choose>
        
        
    </xsl:template>
    
    
</xsl:stylesheet>