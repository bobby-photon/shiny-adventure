/*
 * An XML document type.
 * Localname: getURL
 * Namespace: urn:TBEDispatcherAPI
 * Java type: tbedispatcherapi.GetURLDocument
 *
 * Automatically generated - do not modify.
 */
package tbedispatcherapi.impl;
/**
 * A document containing one getURL(@urn:TBEDispatcherAPI) element.
 *
 * This is a complex type.
 */
public class GetURLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements tbedispatcherapi.GetURLDocument
{
    
    public GetURLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETURL$0 = 
        new javax.xml.namespace.QName("urn:TBEDispatcherAPI", "getURL");
    
    
    /**
     * Gets the "getURL" element
     */
    public tbedispatcherapi.GetURLDocument.GetURL getGetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            tbedispatcherapi.GetURLDocument.GetURL target = null;
            target = (tbedispatcherapi.GetURLDocument.GetURL)get_store().find_element_user(GETURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getURL" element
     */
    public void setGetURL(tbedispatcherapi.GetURLDocument.GetURL getURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            tbedispatcherapi.GetURLDocument.GetURL target = null;
            target = (tbedispatcherapi.GetURLDocument.GetURL)get_store().find_element_user(GETURL$0, 0);
            if (target == null)
            {
                target = (tbedispatcherapi.GetURLDocument.GetURL)get_store().add_element_user(GETURL$0);
            }
            target.set(getURL);
        }
    }
    
    /**
     * Appends and returns a new empty "getURL" element
     */
    public tbedispatcherapi.GetURLDocument.GetURL addNewGetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            tbedispatcherapi.GetURLDocument.GetURL target = null;
            target = (tbedispatcherapi.GetURLDocument.GetURL)get_store().add_element_user(GETURL$0);
            return target;
        }
    }
    /**
     * An XML getURL(@urn:TBEDispatcherAPI).
     *
     * This is a complex type.
     */
    public static class GetURLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements tbedispatcherapi.GetURLDocument.GetURL
    {
        
        public GetURLImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGCODE$0 = 
            new javax.xml.namespace.QName("", "orgCode");
        
        
        /**
         * Gets the "orgCode" element
         */
        public java.lang.String getOrgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "orgCode" element
         */
        public org.apache.xmlbeans.XmlString xgetOrgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "orgCode" element
         */
        public boolean isNilOrgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGCODE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "orgCode" element
         */
        public void setOrgCode(java.lang.String orgCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGCODE$0);
                }
                target.setStringValue(orgCode);
            }
        }
        
        /**
         * Sets (as xml) the "orgCode" element
         */
        public void xsetOrgCode(org.apache.xmlbeans.XmlString orgCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGCODE$0);
                }
                target.set(orgCode);
            }
        }
        
        /**
         * Nils the "orgCode" element
         */
        public void setNilOrgCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGCODE$0);
                }
                target.setNil();
            }
        }
    }
}
