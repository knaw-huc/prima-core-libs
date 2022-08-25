/*
 * Copyright 2019 PRImA Research Lab, University of Salford, United Kingdom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primaresearch.dla.page.layout.physical.impl;

import org.primaresearch.dla.page.io.xml.DefaultXmlNames;
import org.primaresearch.dla.page.layout.physical.ContentFactory;
import org.primaresearch.dla.page.layout.physical.RegionContainer;
import org.primaresearch.dla.page.layout.physical.shared.RegionType;
import org.primaresearch.ident.Id;
import org.primaresearch.ident.IdRegister;
import org.primaresearch.maths.geometry.Polygon;
import org.primaresearch.shared.variable.BooleanValue;
import org.primaresearch.shared.variable.DoubleValue;
import org.primaresearch.shared.variable.IntegerValue;
import org.primaresearch.shared.variable.StringValue;
import org.primaresearch.shared.variable.VariableMap;
import org.primaresearch.shared.variable.VariableValue;
import org.primaresearch.shared.variable.Variable.WrongVariableTypeException;

/**
 * Specialised implementation for graphic regions.
 * Provides getters and setters for default attributes.  
 * 
 * @author Christian Clausner
 */
public class GraphicRegion extends RegionImpl {

	public GraphicRegion(IdRegister idRegister, ContentFactory contentFactory, RegionType type, Id id,
			Polygon coords, VariableMap attributes, RegionContainer parentRegion) {
		super(idRegister, contentFactory, type, id, coords, attributes, parentRegion);
	}

	public String getGraphicType() {
		return ((StringValue)getAttributes().get(DefaultXmlNames.ATTR_type).getValue()).val;
	}

	public void setGraphicType(String type) {
		try {
			getAttributes().get(DefaultXmlNames.ATTR_type).setValue(VariableValue.createValueObject(type));
		} catch (WrongVariableTypeException e) {
			e.printStackTrace();
		}
	}

	public int getNumColours() {
		return ((IntegerValue)getAttributes().get(DefaultXmlNames.ATTR_numColours).getValue()).val;
	}

	public void setNumColours(int num) {
		try {
			getAttributes().get(DefaultXmlNames.ATTR_numColours).setValue(VariableValue.createValueObject(num));
		} catch (WrongVariableTypeException e) {
			e.printStackTrace();
		}
	}

	public double getOrientation() {
		return ((DoubleValue)getAttributes().get(DefaultXmlNames.ATTR_orientation).getValue()).val;
	}
	
	public void setOrientation(double orientation) {
		try {
			getAttributes().get(DefaultXmlNames.ATTR_orientation).setValue(VariableValue.createValueObject(orientation));
		} catch (WrongVariableTypeException e) {
			e.printStackTrace();
		}
	}

	public boolean hasEmbeddedText() {
		return ((BooleanValue)getAttributes().get(DefaultXmlNames.ATTR_embText).getValue()).val;
	}

	public void setEmbeddedText(boolean hasText) {
		try {
			getAttributes().get(DefaultXmlNames.ATTR_embText).setValue(VariableValue.createValueObject(hasText));
		} catch (WrongVariableTypeException e) {
			e.printStackTrace();
		}
	}

}
