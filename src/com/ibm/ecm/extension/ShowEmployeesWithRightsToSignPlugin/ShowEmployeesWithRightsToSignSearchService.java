package com.ibm.ecm.extension.ShowEmployeesWithRightsToSignPlugin;

import com.ibm.ecm.extension.PluginService;
import com.ibm.ecm.extension.PluginServiceCallbacks;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Date: 18.06.14
 * Time: 7:29
 *
 * @author SarokaA
 */
public class ShowEmployeesWithRightsToSignSearchService extends PluginService {

    @Override
    public String getId() {
        return ShowEmployeesWithRightsToSignStructInfo.ID + TextConstants.SEARCH_SERVICE + TextConstants.SERVICE_SUFFIX;
    }

    @Override
    public void execute(PluginServiceCallbacks pluginServiceCallbacks, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Name: " + name + ", Surname: " + surname);
        // TODO: some java

        PrintWriter respWriter = response.getWriter();
        respWriter.print(
                "{\"results\": " +
                        "[" +
                            "{   \"RecordNumber\":\"" + 1 + "\"," +
                                "\"EmployeeNumber\":\"" + 223344 + "\"," +
                                "\"Surname\":\"" + "Bla" + "\"," +
                                "\"Name\":\"" + "BlaName" + "\"," +
                                "\"Patronymic\":\"" + "BlaPatronymic" + "\"," +
                                "\"Documents\":\"" + "x, y, z" + "\"," +
                                "\"SignatureNature\":\"" + "amb" + "\"," +
                                "\"GrantDate\":\"" + "12.12.2012" + "\"," +
                                "\"ExpireDate\":\"" + "12.12.2016" + "\"," +
                                "\"BasesToHaveSignature\":\"" + "He is cool" + "\"," +
                                "\"Status\":\"" + "stat1" + "\"," +
                                "\"Duration\":\"" + "temporarily" + "\"," +
                                "\"Comment\":\"" + "..." + "\"" +
                            "}," +
                            "{   \"RecordNumber\":\"" + 2 + "\"," +
                                "\"EmployeeNumber\":\"" + 556677 + "\"," +
                                "\"Surname\":\"" + "Bla" + "\"," +
                                "\"Name\":\"" + "BlaName" + "\"," +
                                "\"Patronymic\":\"" + "BlaPatronymic" + "\"," +
                                "\"Documents\":\"" + "x, y, z" + "\"," +
                                "\"SignatureNature\":\"" + "amb" + "\"," +
                                "\"GrantDate\":\"" + "12.12.2012" + "\"," +
                                "\"ExpireDate\":\"" + "12.12.2016" + "\"," +
                                "\"BasesToHaveSignature\":\"" + "He is cool" + "\"," +
                                "\"Status\":\"" + "stat1" + "\"," +
                                "\"Duration\":\"" + "temporarily" + "\"," +
                                "\"Comment\":\"" + "..." + "\"" +
                            "}" +
                        "]" +
                "}");

    }
}
