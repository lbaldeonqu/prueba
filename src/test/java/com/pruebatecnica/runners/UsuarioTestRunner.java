package com.pruebatecnica.runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Runner específico para las pruebas de Usuario
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, 
    value = "pretty, html:target/cucumber-reports-usuario.html, json:target/cucumber-reports/Usuario.json")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.pruebatecnica.stepdefinitions")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "classpath:features/usuario.feature")
public class UsuarioTestRunner {
}