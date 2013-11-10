/*******************************************************************************
 * Copyright (c) 2011-2012 Cyan Spring Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms specified by license file attached.
 * 
 * Software distributed under the License is released on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 ******************************************************************************/
package com.cyanspring.server.persistence;

import java.util.Date;

public class MultiInstrumentStrategyDataDb extends TextObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3465310772084393362L;

	public MultiInstrumentStrategyDataDb(String id, Date timeStamp, String xml, int line) {
		super(id, timeStamp, xml, line);
	}
}
