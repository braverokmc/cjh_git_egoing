<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- ���� ���ø� �� -->
    <xsl:template match="/">
        <html>
            <head>xsl ����</head>
            <body> 
                <h2><font color="blue">Our Book's List</font></h2>
                <table border="1" cellspacing="0" width="80%">
                       
                    <tr bgcolor="#FFFF66">
                        <th>title</th>
                        <th>author</th>
                    </tr>
                   
                   <!-- book ���ø� �� ���� -->
                    <xsl:apply-templates select="/booklist/book[@kind='computer']"/>
                    
                </table>
                
                <br/><hr align="left" width="80%" />
                <xsl:call-template name="tCompany" />
                
                
                
            </body>
        </html>
    </xsl:template>
    
    
    <!-- book ���ø� ���� -->
    <xsl:template match="book">
        <tr>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="author"/></td>
        </tr>
    </xsl:template>
    
    
    
    <xsl:template name="tCompany">
        <font color="blue">����ȣ ����Ʈ����</font> - ����� ���ﵿ
    </xsl:template>
    
    
    
</xsl:stylesheet>