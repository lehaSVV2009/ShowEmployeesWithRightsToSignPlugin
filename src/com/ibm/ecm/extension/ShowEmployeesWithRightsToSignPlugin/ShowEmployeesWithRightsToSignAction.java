package com.ibm.ecm.extension.ShowEmployeesWithRightsToSignPlugin;

import com.ibm.ecm.extension.PluginAction;

import java.util.Locale;

public class ShowEmployeesWithRightsToSignAction extends PluginAction {

	private final static String PRIVILEGE = "privAddDoc";
    private final static String ACTION_FUNCTION = "showEmployeesFunction";
    private final static String ACTION_MODEL_CLASS = "ShowEmployeesWithRightsToSignPluginDojo.ShowEmployeesWithRightsToSignActionModel";
	
	@Override
	public String getActionFunction() {
		System.out.println("Kadet!Get Action Function!!!");
		return ACTION_FUNCTION;
	}

	@Override
	public String getIcon() {
		return null;
	}

	@Override
	public String getId() {
		return ShowEmployeesWithRightsToSignStructInfo.ID + TextConstants.ACTION_SUFFIX;
	}

	@Override
	public String getName(Locale arg0) {
		return ShowEmployeesWithRightsToSignStructInfo.NAME;
	}

	@Override
	public String getPrivilege() {
		return PRIVILEGE;
	}

	@Override
	public String getServerTypes() {
		return ShowEmployeesWithRightsToSignStructInfo.SERVER_TYPES;
	}

	@Override
	public boolean isMultiDoc() {
		return true;
	}
	
    @Override
    public String getActionModelClass() {
        return ACTION_MODEL_CLASS;
    }
	
}
