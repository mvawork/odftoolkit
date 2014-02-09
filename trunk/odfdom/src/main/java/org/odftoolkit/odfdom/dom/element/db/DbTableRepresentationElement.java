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
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.db.DbCatalogNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDefaultRowStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDescriptionAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbSchemaNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbTitleAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:table-representation}.
 *
 */
public class DbTableRepresentationElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "table-representation");

	/**
	 * Create the instance of <code>DbTableRepresentationElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbTableRepresentationElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:table-representation}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See {@odf.attribute db:catalog-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbCatalogNameAttribute() {
		DbCatalogNameAttribute attr = (DbCatalogNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "catalog-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See {@odf.attribute db:catalog-name}
	 *
	 * @param dbCatalogNameValue   The type is <code>String</code>
	 */
	public void setDbCatalogNameAttribute(String dbCatalogNameValue) {
		DbCatalogNameAttribute attr = new DbCatalogNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbCatalogNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbDefaultRowStyleNameAttribute</code> , See {@odf.attribute db:default-row-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbDefaultRowStyleNameAttribute() {
		DbDefaultRowStyleNameAttribute attr = (DbDefaultRowStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "default-row-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbDefaultRowStyleNameAttribute</code> , See {@odf.attribute db:default-row-style-name}
	 *
	 * @param dbDefaultRowStyleNameValue   The type is <code>String</code>
	 */
	public void setDbDefaultRowStyleNameAttribute(String dbDefaultRowStyleNameValue) {
		DbDefaultRowStyleNameAttribute attr = new DbDefaultRowStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbDefaultRowStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbDescriptionAttribute() {
		DbDescriptionAttribute attr = (DbDescriptionAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "description");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @param dbDescriptionValue   The type is <code>String</code>
	 */
	public void setDbDescriptionAttribute(String dbDescriptionValue) {
		DbDescriptionAttribute attr = new DbDescriptionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbDescriptionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbNameAttribute() {
		DbNameAttribute attr = (DbNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @param dbNameValue   The type is <code>String</code>
	 */
	public void setDbNameAttribute(String dbNameValue) {
		DbNameAttribute attr = new DbNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbSchemaNameAttribute</code> , See {@odf.attribute db:schema-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbSchemaNameAttribute() {
		DbSchemaNameAttribute attr = (DbSchemaNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "schema-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbSchemaNameAttribute</code> , See {@odf.attribute db:schema-name}
	 *
	 * @param dbSchemaNameValue   The type is <code>String</code>
	 */
	public void setDbSchemaNameAttribute(String dbSchemaNameValue) {
		DbSchemaNameAttribute attr = new DbSchemaNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbSchemaNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbStyleNameAttribute</code> , See {@odf.attribute db:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbStyleNameAttribute() {
		DbStyleNameAttribute attr = (DbStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbStyleNameAttribute</code> , See {@odf.attribute db:style-name}
	 *
	 * @param dbStyleNameValue   The type is <code>String</code>
	 */
	public void setDbStyleNameAttribute(String dbStyleNameValue) {
		DbStyleNameAttribute attr = new DbStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbTitleAttribute() {
		DbTitleAttribute attr = (DbTitleAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "title");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @param dbTitleValue   The type is <code>String</code>
	 */
	public void setDbTitleAttribute(String dbTitleValue) {
		DbTitleAttribute attr = new DbTitleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(dbTitleValue);
	}

	/**
	 * Create child element {@odf.element db:columns}.
	 *
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element db:columns}
	 */
	public DbColumnsElement newDbColumnsElement() {
		DbColumnsElement dbColumns = ((OdfFileDom) this.ownerDocument).newOdfElement(DbColumnsElement.class);
		this.appendChild(dbColumns);
		return dbColumns;
	}

	/**
	 * Create child element {@odf.element db:filter-statement}.
	 *
	 * @param dbCommandValue  the <code>String</code> value of <code>DbCommandAttribute</code>, see {@odf.attribute  db:command} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element db:filter-statement}
	 */
	 public DbFilterStatementElement newDbFilterStatementElement(String dbCommandValue) {
		DbFilterStatementElement dbFilterStatement = ((OdfFileDom) this.ownerDocument).newOdfElement(DbFilterStatementElement.class);
		dbFilterStatement.setDbCommandAttribute(dbCommandValue);
		this.appendChild(dbFilterStatement);
		return dbFilterStatement;
	}

	/**
	 * Create child element {@odf.element db:order-statement}.
	 *
	 * @param dbCommandValue  the <code>String</code> value of <code>DbCommandAttribute</code>, see {@odf.attribute  db:command} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element db:order-statement}
	 */
	 public DbOrderStatementElement newDbOrderStatementElement(String dbCommandValue) {
		DbOrderStatementElement dbOrderStatement = ((OdfFileDom) this.ownerDocument).newOdfElement(DbOrderStatementElement.class);
		dbOrderStatement.setDbCommandAttribute(dbCommandValue);
		this.appendChild(dbOrderStatement);
		return dbOrderStatement;
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
}
