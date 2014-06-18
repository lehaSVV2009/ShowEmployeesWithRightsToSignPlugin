define(
    [
        "dojo/_base/declare",
        "ecm/widget/dialog/BaseDialog",
        "ecm/Messages",
        "ecm/model/Request",
        /*
        "ShowEmployeesWithRightsToSignPluginDojo/SearchEmployeesWithRightsToSignForm",
        "ecm/model/SearchTemplate",
        "ecm/model/SearchCriterion",*/
        "dojo/text!./templates/SearchEmployeesWithRightsToSignDialog.html" ],
    function (declare, BaseDialog, Messages, Request, /*SearchEmployeesWithRightsToSignForm, SearchTemplate, SearchCriterion, */template) {
        console.log('Kadet! searchEmployeesDialog defined!');

        return declare("ShowEmployeesWithRightsToSignPluginDojo.SearchEmployeesWithRightsToSignDialog", [ BaseDialog ], {

            contentString: template,

            _messages : ecm.messages,

            constructor: function () {

            },

            postCreate: function () {

                this.inherited(arguments);
                this.setResizable(true);

            },

            _search: function () {
                console.log('Kadet! search');

                console.log("Name: " + this.employeeSurname.value);

                var serviceParams = {};

                serviceParams.surname = this.employeeSurname.value;
                serviceParams.name = this.employeeName.value;

                var self = this;

                Request.invokePluginService(
                    "ShowEmployeesWithRightsToSignPlugin",
                    "ShowEmployeesWithRightsToSignSearchService",
                    {
                        requestParams: serviceParams,
                        requestCompleteCallback: function(response){

                            console.log("Kadet! response after search!");

                            if (response.results != null) {

                                self.updateResultsForm(response.results);

                            }

                        }
                    }
                );

            },

            _reset: function () {
                console.log('Kadet! reset');
            },

            show : function (repository) {

                this.inherited("show", []);


           /*     var lastDateSearchCriterion = new SearchCriterion({
                    dataType : "xs:date",
                    id : 1

                });

                var searchTemplate = new SearchTemplate({
                    searchCriteria : [lastDateSearchCriterion],
                    repository : repository
                });

                this.searchForm.setSearchTemplate(searchTemplate);
                  */
            },

            updateResultsForm : function (results) {

                console.log("Response after searching: " + results.length);


            }


        });
    });