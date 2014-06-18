
dojo.require("ecm/model/Request");
dojo.require("ShowEmployeesWithRightsToSignPluginDojo.ShowEmployeesWithRightsToSignActionModel");

function showEmployeesFunction (repository, items, callback, teamspace, resultSet) {

	console.log("Kadet! showEmployeesFunction");
	
    serviceCall(items[0], 'showSearchEmployees', callback)

}

function serviceCall (item, action, callback) {
    var serviceParams = {};

    serviceParams.user = item.repository.userId;
    serviceParams.action = action;

    ecm.model.Request.invokePluginService(
        "ShowEmployeesWithRightsToSignPlugin",
        "ShowEmployeesWithRightsToSignService",
        {
            requestParams: serviceParams,
            requestCompleteCallback: function(response){
                messagesDialog.addMessage(response.status);
            }
        }
    );
}