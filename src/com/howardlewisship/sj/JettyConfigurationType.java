package com.howardlewisship.sj;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Hooks into the configurations menu.
 */
public class JettyConfigurationType implements ConfigurationType {
  // TODO: Localize Strings
  public String getDisplayName() {
    return "Slick Jetty Launch";
  }

  public String getConfigurationTypeDescription() {
    return "Launches the web application directly from the workspace.";
  }

  public Icon getIcon() {
    return null;
  }

  @NotNull
  public String getId() {
    return "SlickJetty.Configuration";
  }

  public ConfigurationFactory[] getConfigurationFactories() {
    return new ConfigurationFactory[0];
  }
}
