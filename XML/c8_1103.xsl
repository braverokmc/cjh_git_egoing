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
                        <th>author</th>
                    </tr>
                    
                    <xsl:for-each select="/booklist/book">
                        <tr>
                            <td><xsl:value-of select="title"/></td>
                            <td><xsl:value-of select="author"/></td>
                        </tr>
                    </xsl:for-each>
                    
                    
                </table>
            </body>
        </html>
    </xsl:template>
    
    
    
    
</xsl:stylesheet>