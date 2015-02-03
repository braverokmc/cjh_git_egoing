<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- ���� ���ø� �� -->
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <h2><font color="blue">Our Book's List</font></h2>
                <table border="1" cellspacing="0" width="80%">
                    <tr bgcolor="#FFFF66">
                        <th>no</th>
                        <th>title</th>
                        <th>author</th>
                    </tr>
                    
                    <!-- book ���ø� �� ���� -->
                    <xsl:apply-templates select="/booklist/book"/>
                    
                </table>
            </body>
        </html>
        
    </xsl:template>
    
    
    <!-- book ���ø� ��  -->
    <xsl:template match="book">
        <tr>
            <td align="center"><xsl:number format="1"/></td>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="author"/></td>    
        </tr>
    </xsl:template>



    
    
    
    
</xsl:stylesheet>





