<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- 시작 템플릿 룰 -->
    <xsl:template match="/">
        <html>
            <head>xsl 연습</head>
            <body> 
                <h2><font color="blue">Our Book's List</font></h2>
                <table border="1" cellspacing="0" width="80%">
                       
                    <tr bgcolor="#FFFF66">
                        <th>title</th>
                        <th>author</th>
                    </tr>
                   
                   <!-- book 템플릿 룰 적용 -->
                    <xsl:apply-templates select="/booklist/book[@kind='computer']"/>
                    
                </table>
                
                <br/><hr align="left" width="80%" />
                <xsl:call-template name="tCompany" />
                
                
                
            </body>
        </html>
    </xsl:template>
    
    
    <!-- book 템플릿 적용 -->
    <xsl:template match="book">
        <tr>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="author"/></td>
        </tr>
    </xsl:template>
    
    
    
    <xsl:template name="tCompany">
        <font color="blue">최준호 소프트웨어</font> - 서울시 역삼동
    </xsl:template>
    
    
    
</xsl:stylesheet>