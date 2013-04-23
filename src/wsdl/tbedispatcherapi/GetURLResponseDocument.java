/*
 * An XML document type.
 * Localname: getURLResponse
 * Namespace: urn:TBEDispatcherAPI
 * Java type: tbedispatcherapi.GetURLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package tbedispatcherapi;


/**
 * A document containing one getURLResponse(@urn:TBEDispatcherAPI) element.
 *
 * This is a complex type.
 */
public interface GetURLResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetURLResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s551A288DC9145D916750ECD0AA8D0903").resolveHandle("geturlresponse7e52doctype");
    
    /**
     * Gets the "getURLResponse" element
     */
    tbedispatcherapi.GetURLResponseDocument.GetURLResponse getGetURLResponse();
    
    /**
     * Sets the "getURLResponse" element
     */
    void setGetURLResponse(tbedispatcherapi.GetURLResponseDocument.GetURLResponse getURLResponse);
    
    /**
     * Appends and returns a new empty "getURLResponse" element
     */
    tbedispatcherapi.GetURLResponseDocument.GetURLResponse addNewGetURLResponse();
    
    /**
     * An XML getURLResponse(@urn:TBEDispatcherAPI).
     *
     * This is a complex type.
     */
    public interface GetURLResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetURLResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s551A288DC9145D916750ECD0AA8D0903").resolveHandle("geturlresponse6608elemtype");
        
        /**
         * Gets the "getURLReturn" element
         */
        java.lang.String getGetURLReturn();
        
        /**
         * Gets (as xml) the "getURLReturn" element
         */
        org.apache.xmlbeans.XmlString xgetGetURLReturn();
        
        /**
         * Tests for nil "getURLReturn" element
         */
        boolean isNilGetURLReturn();
        
        /**
         * Sets the "getURLReturn" element
         */
        void setGetURLReturn(java.lang.String getURLReturn);
        
        /**
         * Sets (as xml) the "getURLReturn" element
         */
        void xsetGetURLReturn(org.apache.xmlbeans.XmlString getURLReturn);
        
        /**
         * Nils the "getURLReturn" element
         */
        void setNilGetURLReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static tbedispatcherapi.GetURLResponseDocument.GetURLResponse newInstance() {
              return (tbedispatcherapi.GetURLResponseDocument.GetURLResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static tbedispatcherapi.GetURLResponseDocument.GetURLResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (tbedispatcherapi.GetURLResponseDocument.GetURLResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static tbedispatcherapi.GetURLResponseDocument newInstance() {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static tbedispatcherapi.GetURLResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static tbedispatcherapi.GetURLResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static tbedispatcherapi.GetURLResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static tbedispatcherapi.GetURLResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static tbedispatcherapi.GetURLResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (tbedispatcherapi.GetURLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
