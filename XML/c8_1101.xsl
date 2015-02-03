<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- 시작 템플릿 룰 -->
    <xsl:template match="/">
        <html>
            <body>
                <h2><font color="blue">Our Book's List</font></h2>
                <table border="1" cellspacing="0" width="80%">
                    <tr bgcolor="#FFFF66">
                        <th>title</th>
                        <th>kind</th>
                        <th>author</th>
                    </tr>
                        
                      <!-- book 템플릿 룰 적용 -->
                    <xsl:apply-templates select="/booklist/book" />
                        
                </table>
            </body>
            
        </html>
        
    </xsl:template>
    
    
    <!-- book 템플릿 룰 -->
    <xsl:template match="book">
        <xsl:if test="@kind='computer'">
            <tr>
                <td><xsl:value-of select="title"/></td>
                <td><xsl:value-of select="@kind"/></td>
                <td><xsl:value-of select="author"/></td>
                
            </tr>
        </xsl:if>
    </xsl:template>
        
    
    
</xsl:stylesheet>


