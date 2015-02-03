<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    
    <!-- Result Tree 를 XML 문서 종류로 생성 -->
    <xsl:output  method="html"/>
    
    <!-- Result Tree의 엘리먼트 내용 작성 -->
    <xsl:template match="/">
        <html>
            <body>
                <font color="blue">
                    <xsl:value-of select="/booklist/book"/>
                </font>
            </body>
        </html>
    </xsl:template>
    
    
    
    
    
</xsl:stylesheet>