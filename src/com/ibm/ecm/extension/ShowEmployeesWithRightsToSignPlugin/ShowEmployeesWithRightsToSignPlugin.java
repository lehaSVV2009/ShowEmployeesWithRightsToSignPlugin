package com.ibm.ecm.extension.ShowEmployeesWithRightsToSignPlugin;

import java.util.Locale;

import com.ibm.ecm.extension.Plugin;
import com.ibm.ecm.extension.PluginAction;
import com.ibm.ecm.extension.PluginService;

public class ShowEmployeesWithRightsToSignPlugin extends Plugin {

	private final static String SCRIPT = "ShowEmployeesWithRightsToSignPlugin.js";
	private final static String DOJO_MODULE = "ShowEmployeesWithRightsToSignPluginDojo";
	
	@Override
	public String getId() {
		return ShowEmployeesWithRightsToSignStructInfo.ID + TextConstants.PLUGIN_SUFFIX;
	}

	@Override
	public String getName(Locale arg0) {
		return ShowEmployeesWithRightsToSignStructInfo.NAME;
	}

	@Override
	public String getVersion() {
		return ShowEmployeesWithRightsToSignStructInfo.PLUGIN_VERSION;
	}


	@Override
	public PluginAction[] getActions() {
		return new PluginAction[] {
				new ShowEmployeesWithRightsToSignAction()
		};
	}

	@Override
	public PluginService[] getServices() {
		return new PluginService[] {
				new ShowEmployeesWithRightsToSignService()
		};
	}

	@Override
	public String getScript() {
		System.out.println("Kadet!Get Script!!!");
		return SCRIPT;
	}
	
	 /**
     * @see com.ibm.ecm.extension.Plugin#getDojoModule()
     */
    @Override
    public String getDojoModule()
    {
        return DOJO_MODULE;
    }

/*
	@Override
	public String getConfigurationDijitClass() {
		return "samplePluginDojo.CloseAccountConfigPane";
	}
*/
	
}
