package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LogsCapture {

public static void takeLogs(String message, String classname)
{
DOMConfigurator.configure("../FB_FrameWork/Layout.xml");
Logger l = Logger.getLogger(classname);
l.info(message);
}
}
