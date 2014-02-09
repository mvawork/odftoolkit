/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumLetterSyncAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextFixedAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextPageAdjustAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSelectPageAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:page-number}.
 *
 */
public class TextPageNumberElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "page-number");

	/**
	 * Create the instance of <code>TextPageNumberElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextPageNumberElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:page-number}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See {@odf.attribute style:num-format}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumFormatAttribute() {
		StyleNumFormatAttribute attr = (StyleNumFormatAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-format");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See {@odf.attribute style:num-format}
	 *
	 * @param styleNumFormatValue   The type is <code>String</code>
	 */
	public void setStyleNumFormatAttribute(String styleNumFormatValue) {
		StyleNumFormatAttribute attr = new StyleNumFormatAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNumFormatValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> , See {@odf.attribute style:num-letter-sync}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleNumLetterSyncAttribute() {
		StyleNumLetterSyncAttribute attr = (StyleNumLetterSyncAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-letter-sync");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> , See {@odf.attribute style:num-letter-sync}
	 *
	 * @param styleNumLetterSyncValue   The type is <code>Boolean</code>
	 */
	public void setStyleNumLetterSyncAttribute(Boolean styleNumLetterSyncValue) {
		StyleNumLetterSyncAttribute attr = new StyleNumLetterSyncAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(styleNumLetterSyncValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextFixedAttribute() {
		TextFixedAttribute attr = (TextFixedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "fixed");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @param textFixedValue   The type is <code>Boolean</code>
	 */
	public void setTextFixedAttribute(Boolean textFixedValue) {
		TextFixedAttribute attr = new TextFixedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textFixedValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextPageAdjustAttribute</code> , See {@odf.attribute text:page-adjust}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextPageAdjustAttribute() {
		TextPageAdjustAttribute attr = (TextPageAdjustAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "page-adjust");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextPageAdjustAttribute</code> , See {@odf.attribute text:page-adjust}
	 *
	 * @param textPageAdjustValue   The type is <code>Integer</code>
	 */
	public void setTextPageAdjustAttribute(Integer textPageAdjustValue) {
		TextPageAdjustAttribute attr = new TextPageAdjustAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textPageAdjustValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextSelectPageAttribute</code> , See {@odf.attribute text:select-page}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextSelectPageAttribute() {
		TextSelectPageAttribute attr = (TextSelectPageAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "select-page");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextSelectPageAttribute</code> , See {@odf.attribute text:select-page}
	 *
	 * @param textSelectPageValue   The type is <code>String</code>
	 */
	public void setTextSelectPageAttribute(String textSelectPageValue) {
		TextSelectPageAttribute attr = new TextSelectPageAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textSelectPageValue);
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
	/**
	 * Add text content. Only elements which are allowed to have text content offer this method.
	 */
	public void newTextNode(String content) {
		if (content != null && !content.equals("")) {
			this.appendChild(this.getOwnerDocument().createTextNode(content));
		}
	}
}
