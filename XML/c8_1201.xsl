<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- �۷ι� ���� ���� -->
    <xsl:variable name="vList" select="'å���'" />
    <xsl:variable name="vKind">computer</xsl:variable>
    <xsl:variable name="vSize" select="10" />
    <xsl:variable name="vCompany">
        <font color="blue">��ȣ ����Ʈ</font>�ֽ�ȸ��
    </xsl:variable>
    
    
    <!-- ���� ���ø� �� -->
    <xsl:template match="/">
        <html>
            <body>
                <h2><xsl:value-of select="$vList"/></h2>
                
                <xsl:for-each select="//book[@kind=$vKind]">
                    <font size="{$vSize}">
                        <xsl:value-of select="title"/>
                        
                    </font>
                    <br/>
                </xsl:for-each>
                
                <br/><br/>
                
                <xsl:copy-of select="$vCompany"/>
                
            </body>
        </html>
    </xsl:template>
    
    
    
    
    
    
    
    
</xsl:stylesheet>