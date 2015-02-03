<?xml version="1.0" encoding="UTF-8"?>
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
                        <th>author</th>
                    </tr>
                    
                    <!-- book 템플릿 룰 적용 -->
                    <xsl:apply-templates select="/booklist/book" />
                     
                </table>
            
                <xsl:call-template name="ctBootom"/>
            
            </body>
        </html>
    </xsl:template>


    
    <!-- book 템플릿 룰  -->
    <xsl:template match="book">
        <tr>
             <td><xsl:value-of select="title"/></td>
                <td><xsl:value-of select="author"/></td>
        </tr>
     
    </xsl:template>    


    <!-- bootom -->
    <xsl:template name="ctBootom">
        <font color="green">준호 소프웨어</font>서울시 역삼동
    </xsl:template>



</xsl:stylesheet>






