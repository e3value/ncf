package com.e3value.eval.ncf.ontology;

/*
Copyright (C) 2016 vu.nl, e3value.com

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

    (1) Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.

    (2) Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in
    the documentation and/or other materials provided with the
    distribution.

    (3)The name of the author may not be used to
    endorse or promote products derived from this software without
    specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO
EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE.

This code contains third-party software, as in mentioned in the included
licenses.txt file.The third-party software is redistributed under their own
intellectual property rights. Other third-party software components may need
to be downloaded separately under their own intellectual property rights.
Please check and follow applicable third party intellectual
property conditions.
*/

import java.util.Iterator;

import org.apache.log4j.Logger;

// RDFS2Class: imports

// RDFS2Class: end of imports

/**
 * RDFS2Class: class diagram
 * <p>
 */
public class diagram extends e3value_object {

    static Logger log = Logger.getLogger(diagram.class.getName());

    /**
     * extended generated class with methods to maintain hashmap with all
     * objects for export
     **/

    /** RDFS2Class: slot di_has_mc **/
    protected de.dfki.rdf.util.PropertyInfo m_di_has_mc = de.dfki.rdf.util.PropertyInfo
            .createInstanceProperty("di_has_mc",
                    new Class[] { model_concept.class }, true);

    /** RDFS2Class: putter for slot di_has_mc **/
    public void putDi_has_mc(model_concept p_di_has_mc) {
        m_di_has_mc.putValue(p_di_has_mc);
    }

    public void putDi_has_mc(de.dfki.rdf.util.RDFResource p_di_has_mc) {
        m_di_has_mc.putValue(p_di_has_mc);
    }

    public void putDi_has_mc(java.util.Collection p_di_has_mc) {
        m_di_has_mc.setValues(p_di_has_mc);
    }

    public void clearDi_has_mc() {
        m_di_has_mc.clearValue();
    }
    // RDFS2Class: end of putter for slot di_has_mc

    /** RDFS2Class: getter for slot di_has_mc **/
    public java.util.Collection getDi_has_mc() {
        return (java.util.Collection) m_di_has_mc.getValue();
    }
    // RDFS2Class: end of getter for slot di_has_mc

    // ------------------------------------------------------------------------------
    /** RDFS2Class: toString()-stuff **/
    @Override
    public void toString(StringBuffer sb, String sIndent) {
        super.toString(sb, sIndent);
        if (!m_di_has_mc.isEmpty()) {
            sb.append(sIndent + "-> di_has_mc:\n");
            for (Iterator it_di_has_mc = ((java.util.Collection) m_di_has_mc
                    .getValue()).iterator(); it_di_has_mc.hasNext();) {
                sb.append(sIndent + "       "
                        + ((de.dfki.rdf.util.RDFResource) it_di_has_mc.next())
                                .toStringShort()
                        + "\n");
            }
        }
    }
    // RDFS2Class: end of toString()-stuff

    // ------------------------------------------------------------------------------
    /** RDFS2Class: sub class information **/
    public final static Class[] KNOWN_SUBCLASSES = {};

    // RDFS2Class: end of sub class information

    // ------------------------------------------------------------------------------
    /** RDFS2Class: default constructor **/
    public diagram() {
        super();
        initPropertyStore();
    }
    // RDFS2Class: end of default constructor

    // ------------------------------------------------------------------------------
    /** RDFS2Class: PropertyStore-stuff **/
    private void initPropertyStore() {
        de.dfki.rdf.util.PropertyStore ps = getPropertyStore();
        ps.addProperty(m_di_has_mc);
    }
    // RDFS2Class: end of PropertyStore-stuff

}

// RDFS2Class: end of class diagram
// EOF
