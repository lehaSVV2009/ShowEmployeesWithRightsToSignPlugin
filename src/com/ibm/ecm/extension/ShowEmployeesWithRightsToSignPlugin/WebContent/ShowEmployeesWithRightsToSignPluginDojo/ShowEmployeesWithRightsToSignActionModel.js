dojo.provide("ShowEmployeesWithRightsToSignPluginDojo.ShowEmployeesWithRightsToSignActionModel");

dojo.require("ecm.model.Action");
dojo.require("ecm.model.ContentClass");
dojo.require("dojo._base.connect");
dojo.require("dojo._base.lang");
dojo.declare("ShowEmployeesWithRightsToSignPluginDojo.ShowEmployeesWithRightsToSignActionModel", [ ecm.model.Action ], {
	isEnabled : function(repository, listType, items, workspace, resultSet)
	{
		console.log("Kadet! isEnabled");
		
        return true;
	},

	isVisible : function(repository, listType)
	{
		console.log("Kadet! isVisible");
		
        return true;
    }
});