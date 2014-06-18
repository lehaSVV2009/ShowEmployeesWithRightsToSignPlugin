define(
    [
        "dojo/_base/declare",
        "ecm/widget/search/SearchForm"],
    function (declare, SearchForm) {
        console.log('Kadet! searchEmployeesForm defined!');

        return declare("ShowEmployeesWithRightsToSignPluginDojo.SearchEmployeesWithRightsToSignForm", [ SearchForm ], {

            constructor: function () {

                console.log("Kadet! ShowEmployeesForm constructor");

            },

            postCreate: function () {

                this.inherited(arguments);

            }


        });
    });