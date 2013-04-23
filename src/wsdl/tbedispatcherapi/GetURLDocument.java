/*
 * An XML document type.
 * Localname: getURL
 * Namespace: urn:TBEDispatcherAPI
 * Java type: tbedispatcherapi.GetURLDocument
 *
 * Automatically generated - do not modify.
 */
package tbedispatcherapi;


/**
 * A document containing one getURL(@urn:TBEDispatcherAPI) element.
 *
 * This is a complex type.
 */
public interface GetURLDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetURLDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s551A288DC9145D916750ECD0AA8D0903").resolveHandle("geturl6e13doctype");
    
    /**
     * Gets the "getURL" element
     */
    tbedispatcherapi.GetURLDocument.GetURL getGetURL();
    
    /**
     * Sets the "getURL" element
     */
    void setGetURL(tbedispatcherapi.GetURLDocument.GetURL getURL);
    
    /**
     * Appends and returns a new empty "getURL" element
     */
    tbedispatcherapi.GetURLDocument.GetURL addNewGetURL();
    
    /**
     * An XML getURL(@urn:TBEDispatcherAPI).
     *
     * This is a complex type.
     */
    public interface GetURL extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetURL.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s551A288DC9145D916750ECD0AA8D0903").resolveHandle("geturlb428elemtype");
        
        /**
         * Gets the "orgCode" element
         */
        java.lang.String getOrgCode();
        
        /**
         * Gets (as xml) the "orgCode" element
         */
        org.apache.xmlbeans.XmlString xgetOrgCode();
        
        /**
         * Tests for nil "orgCode" element
         */
        boolean isNilOrgCode();
        
        /**
         * Sets the "orgCode" element
         */
        void setOrgCode(java.lang.String orgCode);
        
        /**
         * Sets (as xml) the "orgCode" element
         */
        void xsetOrgCode(org.apache.xmlbeans.XmlString orgCode);
        
        /**
         * Nils the "orgCode" element
         */
        void setNilOrgCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static tbedispatcherapi.GetURLDocument.GetURL newInstance() {
              return (tbedispatcherapi.GetURLDocument.GetURL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static tbedispatcherapi.GetURLDocument.GetURL newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (tbedispatcherapi.GetURLDocument.GetURL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static tbedispatcherapi.GetURLDocument newInstance() {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static tbedispatcherapi.GetURLDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static tbedispatcherapi.GetURLDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static tbedispatcherapi.GetURLDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static tbedispatcherapi.GetURLDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static tbedispatcherapi.GetURLDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static tbedispatcherapi.GetURLDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static tbedispatcherapi.GetURLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static tbedispatcherapi.GetURLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (tbedispatcherapi.GetURLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
