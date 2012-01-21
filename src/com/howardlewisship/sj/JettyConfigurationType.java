package com.howardlewisship.sj;

import com.intellij.execution.configuration.ConfigurationFactoryEx;
import com.intellij.execution.configurations.ConfigurationTypeBase;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Hooks into the configurations menu.
 */
public class JettyConfigurationType extends ConfigurationTypeBase {

  // TODO: Localize Strings

  public JettyConfigurationType() {
    super("SlickJetty.Configuration",
          "Slick Jetty Launch",
          "Launches the web application directly from the workspace.",
          null);

    addFactory(new ConfigurationFactoryEx(this) {
      @Override
      public RunConfiguration createTemplateConfiguration(Project project) {

        Messages.showMessageDialog("Request for template configuration.", "Slick Jetty", null);

        return null;
      }
    });
  }
}
