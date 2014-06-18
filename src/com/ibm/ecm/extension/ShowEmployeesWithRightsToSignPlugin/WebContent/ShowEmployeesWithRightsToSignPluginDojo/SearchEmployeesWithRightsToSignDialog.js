define(
    [
        "dojo/_base/declare",
        "ecm/widget/dialog/BaseDialog",
        "ecm/Messages",
        /*
        "ShowEmployeesWithRightsToSignPluginDojo/SearchEmployeesWithRightsToSignForm",
        "ecm/model/SearchTemplate",
        "ecm/model/SearchCriterion",*/
        "dojo/text!./templates/SearchEmployeesWithRightsToSignDialog.html" ],
    function (declare, BaseDialog, Messages, /*SearchEmployeesWithRightsToSignForm, SearchTemplate, SearchCriterion, */template) {
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

                console.log("Name: " + this.employeeSurnameValue.value);

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
            }


        });
    });