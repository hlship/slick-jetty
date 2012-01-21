package com.howardlewisship.sj;

import com.intellij.execution.configurations.ConfigurationTypeBase;

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
  }
}
