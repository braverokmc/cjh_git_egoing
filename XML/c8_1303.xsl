<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">

    <!-- 외부 XSL 문서 참조 -->
    <xsl:import href="c8_1302.xsl" />
    
    <!-- 시작 템플릿 룰 -->
    <xsl:template match="/">
         <html>
             <body>
                 <h2><font color="blue">Our Book's List</font></h2>
                 <table>
                     <tr bgcolor="#FFFF66">
                         <th>title</th>
                         <th>author</th>
                     </tr>
                 </table>
                 
                 <!-- book 템플릿 룰 적용 -->
                 <xsl:apply-templates  select="/booklist/book" />
                 
                 
             </body>
        </html>
    </xsl:template>


</xsl:stylesheet>