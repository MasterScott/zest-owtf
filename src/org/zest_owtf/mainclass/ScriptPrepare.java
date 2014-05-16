package org.zest_owtf.mainclass;

import org.mozilla.zest.core.v1.ZestScript;

public class ScriptPrepare {
	
	public Filereader rdr= new Filereader("test.zst");
	
	public ScriptType sa=new ScriptType("stand_alone","script.type.stand_alone",null,true);
	
	//scriptwrapper created
	public ScriptWrapper script= new ScriptWrapper();
	public ZestScript scr=null;
	
	public ScriptPrepare(){
		
		script.setType(sa);
		script.setContents(rdr.content);
		script.setEngine(null);
		script.setName("test_script");
		script.setDescription(null);
		script.setLoadOnStart(false);
	
		//zest-scriptwrapper created
		ZestScriptWrapper zsw = new ZestScriptWrapper(script);
		
		scr= zsw.getZestScript();
	}
	
	

}