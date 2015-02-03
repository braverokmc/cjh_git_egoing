<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- 글로벌 변수 선언 -->
    <xsl:variable name="vList" select="'책목록'" />
    <xsl:variable name="vKind">computer</xsl:variable>
    <xsl:variable name="vSize" select="10" />
    <xsl:variable name="vCompany">
        <font color="blue">준호 소프트</font>주식회사
    </xsl:variable>
    
    
    <!-- 시작 템플릿 룰 -->
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