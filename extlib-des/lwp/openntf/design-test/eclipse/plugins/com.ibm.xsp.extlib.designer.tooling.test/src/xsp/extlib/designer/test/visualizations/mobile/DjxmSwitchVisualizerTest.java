/*
 * Copyright IBM Corp. 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package xsp.extlib.designer.test.visualizations.mobile;

import java.util.HashMap;

import xsp.extlib.designer.test.visualizations.AbstractDynamicVisualizationTest;

import com.ibm.xsp.extlib.designer.tooling.visualizations.mobile.DjxmSwitchVisualizer;

public class DjxmSwitchVisualizerTest extends AbstractDynamicVisualizationTest {
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#getTagName()
	 */
	@Override
	public String getTagName() {
		return "djxmSwitch";
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#getTagName()
	 */
	@Override
	public String getNamespaceURI() {
		return EXT_LIB_NAMESPACE_URI;
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		_visualizationFactory = new DjxmSwitchVisualizer();
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#isRenderMarkupStatic()
	 */
	@Override
	public boolean isRenderMarkupStatic(){
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#getExectedXSPMarkup()
	 */
	@Override
	public String getExpectedXSPMarkup() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<%");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("var leftLabelVar=this.leftLabel;");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("if(null==leftLabelVar || leftLabelVar==\"\"){");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("leftLabelVar=\"Left Label\";");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("}");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("%>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<%");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("var rightLabelVar=this.rightLabel;");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("if(null==rightLabelVar || rightLabelVar==\"\"){");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("rightLabelVar=\"Right Label\";");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("}");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("%>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;padding:3.0px;margin-left:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value><%=leftLabelVar%></xp:this.value></xp:label>");
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;background-color:rgb(192,192,192);padding:3.0px;margin-right:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value><%=rightLabelVar%></xp:this.value></xp:label>");
		strBuilder.append(LINE_DELIMITER); 
		return strBuilder.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#getExpectedFullXSPMarkup()
	 */
	@Override
	public String getExpectedFullXSPMarkup() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(getDefaultXPageHeader());
		strBuilder.append(getExpectedXSPMarkup());
		strBuilder.append(getDefaultXPageFooter());
		return strBuilder.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractVisualizationTest#getExpectedProcessedFullXSPMarkup()
	 */
	@Override
	public String getExpectedProcessedFullXSPMarkup() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:view xmlns:xp=\"http://www.ibm.com/xsp/core\">");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;padding:3.0px;margin-left:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value>Left Label</xp:this.value></xp:label>");
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;background-color:rgb(192,192,192);padding:3.0px;margin-right:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value>Right Label</xp:this.value></xp:label>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("</xp:view>");
		return strBuilder.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractDynamicVisualizationTest#getAttributesToSet()
	 */
	@Override
	public HashMap<String, String> getAttributesToSet() {
		HashMap<String,String> attributes = new HashMap<String,String>();
		attributes.put("leftLabel","On");
		attributes.put("rightLabel","Off");
		return attributes;
	}

	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractDynamicVisualizationTest#getExpectedProcessedFullXSPMarkupAfterSettingAttributes()
	 */
	@Override
	public String getExpectedProcessedFullXSPMarkupAfterSettingAttributes() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:view xmlns:xp=\"http://www.ibm.com/xsp/core\">");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;padding:3.0px;margin-left:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value>On</xp:this.value></xp:label>");
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;background-color:rgb(192,192,192);padding:3.0px;margin-right:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value>Off</xp:this.value></xp:label>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("</xp:view>");
		return strBuilder.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractDynamicVisualizationTest#getComputedAttributesToSet()
	 */
	@Override
	public HashMap<String, String> getComputedAttributesToSet() {
		HashMap<String,String> attributes = new HashMap<String,String>();
		attributes.put("leftLabel",TEST_JAVASCRIPT);
		attributes.put("rightLabel",TEST_JAVASCRIPT);
		return attributes;
	}

	/*
	 * (non-Javadoc)
	 * @see xsp.extlib.designer.test.visualizations.AbstractDynamicVisualizationTest#getExpectedProcessedFullXSPMarkupAfterSettingComputedAttributes()
	 */
	@Override
	public String getExpectedProcessedFullXSPMarkupAfterSettingComputedAttributes() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:view xmlns:xp=\"http://www.ibm.com/xsp/core\">");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;padding:3.0px;margin-left:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value>"+TEST_JAVASCRIPT+"</xp:this.value></xp:label>");
		strBuilder.append("<xp:label style=\"border-color:rgb(192,192,192);border-style:solid;border-width:thin;background-color:rgb(192,192,192);padding:3.0px;margin-right:1px;margin-top:1px;margin-bottom:1px\"><xp:this.value>"+TEST_JAVASCRIPT+"</xp:this.value></xp:label>");
		strBuilder.append(LINE_DELIMITER);
		strBuilder.append("</xp:view>");
		return strBuilder.toString();
	}

}
