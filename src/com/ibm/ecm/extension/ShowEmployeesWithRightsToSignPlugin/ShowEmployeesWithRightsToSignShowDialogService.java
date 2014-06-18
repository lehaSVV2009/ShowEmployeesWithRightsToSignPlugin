package com.ibm.ecm.extension.ShowEmployeesWithRightsToSignPlugin;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.ecm.extension.PluginService;
import com.ibm.ecm.extension.PluginServiceCallbacks;

public class ShowEmployeesWithRightsToSignShowDialogService extends PluginService {

    @Override
    public void execute(PluginServiceCallbacks arg0, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("Kadet! Execute Service!!!");
        PrintWriter respWriter = response.getWriter();
        respWriter.print(
                "{\"results\":" +
                        "{\"YAHOO\":\"" + 123 + "\"}" +
                "}");
    }

    @Override
    public String getId() {
        return ShowEmployeesWithRightsToSignStructInfo.ID + TextConstants.SHOW_SEARCH_DIALOG_SERVICE + TextConstants.SERVICE_SUFFIX;
    }

}
