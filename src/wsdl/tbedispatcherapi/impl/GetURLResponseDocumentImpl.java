/*
 * An XML document type.
 * Localname: getURLResponse
 * Namespace: urn:TBEDispatcherAPI
 * Java type: tbedispatcherapi.GetURLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package tbedispatcherapi.impl;
/**
 * A document containing one getURLResponse(@urn:TBEDispatcherAPI) element.
 *
 * This is a complex type.
 */
public class GetURLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements tbedispatcherapi.GetURLResponseDocument
{
    
    public GetURLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETURLRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:TBEDispatcherAPI", "getURLResponse");
    
    
    /**
     * Gets the "getURLResponse" element
     */
    public tbedispatcherapi.GetURLResponseDocument.GetURLResponse getGetURLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            tbedispatcherapi.GetURLResponseDocument.GetURLResponse target = null;
            target = (tbedispatcherapi.GetURLResponseDocument.GetURLResponse)get_store().find_element_user(GETURLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getURLResponse" element
     */
    public void setGetURLResponse(tbedispatcherapi.GetURLResponseDocument.GetURLResponse getURLResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            tbedispatcherapi.GetURLResponseDocument.GetURLResponse target = null;
            target = (tbedispatcherapi.GetURLResponseDocument.GetURLResponse)get_store().find_element_user(GETURLRESPONSE$0, 0);
            if (target == null)
            {
                target = (tbedispatcherapi.GetURLResponseDocument.GetURLResponse)get_store().add_element_user(GETURLRESPONSE$0);
            }
            target.set(getURLResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getURLResponse" element
     */
    public tbedispatcherapi.GetURLResponseDocument.GetURLResponse addNewGetURLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            tbedispatcherapi.GetURLResponseDocument.GetURLResponse target = null;
            target = (tbedispatcherapi.GetURLResponseDocument.GetURLResponse)get_store().add_element_user(GETURLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getURLResponse(@urn:TBEDispatcherAPI).
     *
     * This is a complex type.
     */
    public static class GetURLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements tbedispatcherapi.GetURLResponseDocument.GetURLResponse
    {
        
        public GetURLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETURLRETURN$0 = 
            new javax.xml.namespace.QName("", "getURLReturn");
        
        
        /**
         * Gets the "getURLReturn" element
         */
        public java.lang.String getGetURLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETURLRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "getURLReturn" element
         */
        public org.apache.xmlbeans.XmlString xgetGetURLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETURLRETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "getURLReturn" element
         */
        public boolean isNilGetURLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETURLRETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getURLReturn" element
         */
        public void setGetURLReturn(java.lang.String getURLReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETURLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETURLRETURN$0);
                }
                target.setStringValue(getURLReturn);
            }
        }
        
        /**
         * Sets (as xml) the "getURLReturn" element
         */
        public void xsetGetURLReturn(org.apache.xmlbeans.XmlString getURLReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETURLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETURLRETURN$0);
                }
                target.set(getURLReturn);
            }
        }
        
        /**
         * Nils the "getURLReturn" element
         */
        public void setNilGetURLReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETURLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETURLRETURN$0);
                }
                target.setNil();
            }
        }
    }
}
