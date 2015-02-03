<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- Result Tree를 XML 문서 종류로 생성 -->
   <xsl:output method="xml" version="1.0" encoding="euc-kr"
           indent="yes"/>
    
    <!-- Result Tree 의 엘리먼트 내용 작성 -->
    <xsl:template match="/">
        <책목록>
            <책>
           <xsl:value-of select="/booklist/book"/>     
            </책>
        </책목록>
       
    </xsl:template>
   
    
    
    
</xsl:stylesheet>