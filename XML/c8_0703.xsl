<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">

    <!-- 시작 템플릿 룰 -->
    
    <xsl:template match="/">
        <html>
            <head>템플릿 룰의 priority 속성</head>
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
            </body>
        </html>
    </xsl:template>

    <!-- book 템플릿 룰 -->
    <xsl:template match="book" priority="1">
        <tr>
            <td>
                <font color="red">
                    <xsl:value-of select="title"/> </font></td>
            <td><xsl:value-of select="author"/></td>
        </tr>
    </xsl:template>

    <xsl:template match="/booklist/book" priority="2">
        <tr>
            <td>
                <font color="red"><xsl:value-of select="title"/></font>
            </td>
            
            <td>
                <font color="green"><xsl:value-of select="author"/></font>
            </td>
            
        
        </tr>
        
    </xsl:template>



</xsl:stylesheet>




