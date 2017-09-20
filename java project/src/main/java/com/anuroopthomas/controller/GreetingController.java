package com.anuroopthomas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    int test = 90;
    int hydrocoPLFT = 70;
    int simPLFT = 90;
    int lisPLFT = 100;
    int hydrochPLFT = 100;
    int lipPLFT = 90;
    String json = null;

    boolean hydrocoTAK = false;
    boolean simTAK = false;
    boolean lisTAK = false;
    boolean hydrochTAK = false;
    boolean lipTAK = false;

    @RequestMapping("/")
    public String greeting(){


        //return "<body bgcolor='red'><table style='width=100%' border='2px'> <tr> <th>Drug Name</th><th>Mg Amount</th> <th>Min Number</th> <th>Max Number</th> <th>Pills In Bottle</th> <th>Use For Medication</th> <th>Medicine Taken Today</th> </tr> <tr> <td>Hydrocodone</td><td>5</td> <td>4</td> <td>8</td> <td>" + hydrocoPLFT +"</td><td>Pain (usually with Acetaminophen)</td><td>" + hydrocoTAK + "</td></tr> <tr> <td>Simvastin</td> <td>20</td> <td>1</td> <td>1</td> <td>" + simPLFT +"</td><td>High Cholesterol</td><td>" + simTAK + "</td></tr> <tr> <td>Lisinopril</td> <td>10</td> <td>1</td> <td>1</td> <td>" + lisPLFT +"</td><td>High Blood pressure and heart failure</td><td>" + lisTAK + "</td></tr></table></body>";

        String x =  "<!DOCTYPE html>\n" +
"                <html> \n" +
"                <head>\n" +
"                  <meta charset='UTF-8'>\n" +
"                  <title>Medicine Test</title>\n" +
"                  \n" +
"                  \n" +
"                  <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'> \n" +
"                <link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css'> \n" +
"                \n" +
"                      <link rel='stylesheet'> \n" +
"                      <style>\n" +
"                .table-editable { \n" +
"                	position: relative; \n" +
"                }\n" +
"                .table-editable .glyphicon { \n" +
"                	font-size: 20px;\n" +
"                }\n" +
"                 \n" +
"                .table-remove { \n" +
"                	color: #700; \n" +
"                	cursor: pointer; \n" +
"                }\n" +
"                .table-remove:hover { \n" +
"                	color: #f00; \n" +
"                }\n" +
"                 \n" +
"                .table-up, .table-down { \n" +
"                	color: #007;\n" +
"                	cursor: pointer; \n" +
"                }\n" +
"                .table-up:hover, .table-down:hover {\n" +
"                	color: #00f;\n" +
"                }\n" +
"                 \n" +
"                .table-add {\n" +
"                	color: #070; \n" +
"                	cursor: pointer; \n" +
"                	position: absolute; \n" +
"                	top: 8px; \n" +
"                	right: 0; \n" +
"                }\n" +
"                .table-add:hover { \n" +
"                	color: #0b0;\n" +
"                }\n" +
"                 \n" +
"                      </style> \n" +
"                 <script>\n" +
"                 \n" +
"				function download(content, name, contentType) {\n" +
"					if(!contentType) contentType = 'application/octet-stream';\n" +
"					\n" +
"  					var a = document.createElement(\"a\");\n" +
"  					var file = new Blob([content], {'type': contentType});\n" +
"  					a.href = URL.createObjectURL(file);\n" +
"  					a.download = name;\n" +
"  					a.click();\n" +
"  					\n" +
"  					\n" +
"  					\n" +
"				}\n" +
"     \n" +
"                 </script>\n" +
"                  \n" +
"                </head> \n" +
"                \n" +
"                <body> \n" +
"                  <div class='container'> \n" +
"                  <h1>Medicine Schedule</h1> \n" +
"                  <!--<p>Through the powers of <strong>contenteditable</strong> and some simple jQuery you can easily create a custom editable table. No need for a robust JavaScript library anymore these days.</p> \n" +
"                   \n" +
"                  <ul> \n" +
"                    <li>An editable table that exports a hash array. Dynamically compiles rows from headers</li>  \n" +
"                    <li>Simple / powerful features such as add row, remove row, move row up/down.</li> \n" +
"                  </ul>--> \n" +
"                  \n" +
"                  <div id='table' class='table-editable'>\n" +
"                    <span class='table-add glyphicon glyphicon-plus'></span>\n" +
"                    <table class='table'>\n" +
"                      <tr>\n" +
"                        <th>Drug Name</th> \n" +
"                        <th>Mg Amount</th> \n" +
"                        <th>Min Number</th> \n" +
"                        <th>Max Number</th> \n" +
"                        <th>Pills In Prescription Bottle</th> \n" +
"                        <th>Use For Medicine</th>\n" +
"                        <th>Medicine Taken Today</th> \n" +
"                        <th> </th>\n" +
"                        <th> </th> \n" +
"                        <th> </th> \n" +
"                      </tr>\n" +
"                      <tr> \n" +
"                        <td contenteditable='true'>Hydrocodone</td> \n" +
"                        <td contenteditable='true'>5</td> \n" +
"                        <td contenteditable='true'>4</td> \n" +
"                        <td contenteditable='true'>8</td> \n" +
"                        <td contenteditable='true'>"+ hydrocoPLFT  +"</td> \n" +
"                        <td contenteditable='true'>Pain (usually with Acetaminophen)</td> \n" +
"                        <td contenteditable='true'>"+ hydrocoTAK +"</td> \n" +
"                        <td> \n" +
"                          <span class='table-remove glyphicon glyphicon-remove'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-up glyphicon glyphicon-arrow-up'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-down glyphicon glyphicon-arrow-down'></span> \n" +
"                        </td> \n" +
"                      </tr> \n" +
"                       \n" +
"                      <tr> \n" +
"                        <td contenteditable='true'>Simvastatin</td> \n" +
"                        <td contenteditable='true'>20</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>"+ simPLFT +"</td> \n" +
"                        <td contenteditable='true'>High Cholesterol</td> \n" +
"                        <td contenteditable='true'>"+ simTAK +"</td> \n" +
"                        <td> \n" +
"                          <span class='table-remove glyphicon glyphicon-remove'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-up glyphicon glyphicon-arrow-up'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-down glyphicon glyphicon-arrow-down'></span> \n" +
"                        </td> \n" +
"                      </tr> \n" +
"                       \n" +
"                      <tr> \n" +
"                        <td contenteditable='true'>Lisinopril</td> \n" +
"                        <td contenteditable='true'>10</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>"+ lisPLFT +"</td> \n" +
"                        <td contenteditable='true'>High Blood pressure and heart failure</td> \n" +
"                        <td contenteditable='true'>"+ lisTAK +"</td> \n" +
"                        <td> \n" +
"                          <span class='table-remove glyphicon glyphicon-remove'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-up glyphicon glyphicon-arrow-up'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-down glyphicon glyphicon-arrow-down'></span> \n" +
"                        </td> \n" +
"                      </tr> \n" +
"                       \n" +
"                      <tr> \n" +
"                        <td contenteditable='true'>Hydrochlorothiazide</td> \n" +
"                        <td contenteditable='true'>25</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>"+ hydrochPLFT +"</td> \n" +
"                        <td contenteditable='true'>High blood pressure and fluid retention</td> \n" +
"                        <td contenteditable='true'>"+ hydrochTAK +"</td> \n" +
"                        <td> \n" +
"                          <span class='table-remove glyphicon glyphicon-remove'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-up glyphicon glyphicon-arrow-up'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-down glyphicon glyphicon-arrow-down'></span> \n" +
"                        </td> \n" +
"                      </tr> \n" +
"                       \n" +
"                      <tr> \n" +
"                        <td contenteditable='true'>Liptor</td> \n" +
"                        <td contenteditable='true'>10</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>1</td> \n" +
"                        <td contenteditable='true'>"+ lipPLFT +"</td> \n" +
"                        <td contenteditable='true'>High Chloresterol</td> \n" +
"                        <td contenteditable='true'>"+ lipTAK +"</td> \n" +
"                        <td> \n" +
"                          <span class='table-remove glyphicon glyphicon-remove'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-up glyphicon glyphicon-arrow-up'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-down glyphicon glyphicon-arrow-down'></span> \n" +
"                        </td> \n" +
"                      </tr> \n" +
"                 \n" +
"                      <!-- This is our clontable table line --> \n" +
"                      <tr class='hide'> \n" +
"                        <td contenteditable='true'>Drug</td> \n" +
"                        <td contenteditable='true'>x</td> \n" +
"                        <td contenteditable='true'>x</td> \n" +
"                        <td contenteditable='true'>x</td> \n" +
"                        <td contenteditable='true'>x</td> \n" +
"                        <td contenteditable='true'>Description</td> \n" +
"                         \n" +
"                        <td> \n" +
"                          <span class='table-remove glyphicon glyphicon-remove'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-up glyphicon glyphicon-arrow-up'></span> \n" +
"                        </td> \n" +
"                        <td> \n" +
"                          <span class='table-down glyphicon glyphicon-arrow-down'></span> \n" +
"                        </td> \n" +
"                      </tr> \n" +
"                    </table> \n" +
"                  </div> \n" +
"                   \n" +
"                  <button id='export-btn' class='btn btn-primary'>Export Data</button> \n" +
"                  <p id='export'></p> \n" +
"                  <button onclick=\"download(dataexport2, 'medicine.json', 'json/plain')\" class='btn btn-primary'>Create file</button>\n" +
"                  \n" +
"\n" +
"                </div> \n" +
"                \n" +
"                  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script> \n" +
"                <script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script> \n" +
"                <script src='https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js'></script> \n" +
"                <script src='http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.6.0/underscore.js'></script> \n" +
"                 \n" +
"            <script>\n" +
"                var $table = $('#table'); \n" +
"                var $BTN = $('#export-btn'); \n" +
"                var $EXPORT = $('#export');\n" +
"                \n" +
"                //var dataexport2 = \"\";\n" +
"                \n" +
"                 \n" +
"                $('.table-add').click(function () { \n" +
"                	var $clone = $TABLE.find('tr.hide').clone(true).removeClass('hide table-line'); \n" +
"                	$TABLE.find('table').append($clone); \n" +
"                }); \n" +
"                \n" +
"                $('.table-remove').click(function () { \n" +
"                	$(this).parents('tr').detach(); \n" +
"                }); \n" +
"                 \n" +
"                $('.table-up').click(function () { \n" +
"                	var $row = $(this).parents('tr'); \n" +
"                	if ($row.index() === 1) return; // Don go above the header \n" +
"                	$row.prev().before($row.get(0)); \n" +
"                }); \n" +
"                \n" +
"                $('.table-down').click(function () { \n" +
"                	var $row = $(this).parents('tr'); \n" +
"                	$row.next().after($row.get(0)); \n" +
"                }); \n" +
"                \n" +
"                \n" +
"                \n" +
"                // A few jQuery helpers for exporting only \n" +
"                jQuery.fn.pop = [].pop;\n" +
"                jQuery.fn.shift = [].shift; \n" +
"                \n" +
"                $BTN.click(function () {\n" +
"                  var $rows = $table.find('tr:not(:hidden)'); \n" +
"                  var headers = []; \n" +
"                  var data = []; \n" +
"                  \n" +
"                  // Get the headers (add special header logic here) \n" +
"                $($rows.shift()).find('th:not(:empty)').each(function () { \n" +
"                	headers.push($(this).text().toLowerCase()); \n" +
"                  }); \n" +
"                  \n" +
"                  // Turn all existing rows into a looptable array \n" +
"                $rows.each(function () {\n" +
"                	var $td = $(this).find('td'); \n" +
"                	var h = {}; \n" +
"                    \n" +
"                    // Use the headers from earlier to name our hash keys \n" +
"                    headers.forEach(function (header, i) { \n" +
"                      h[header] = $td.eq(i).text();    \n" +
"                    }); \n" +
"                    \n" +
"                    data.push(h); \n" +
"                	}); \n" +
"                  \n" +
"                  // Output the result\n" +
"                  \n" +
"                   	dataexport2 = JSON.stringify(data);\n" +
"                	\n" +
"                	\n" +
"                	\n" +
"                  	$EXPORT.text(\"This is displayed in JSON format: \" + JSON.stringify(data));\n" +
"                  \n" +
"                });\n" +
"                var dataexport3 = dataexport2;\n" +
"                \n" +
"                \n" +
"                </script> \n" +
"				\n" +
"                </body> \n" +
"                </html>";

        return x;


    }


}

