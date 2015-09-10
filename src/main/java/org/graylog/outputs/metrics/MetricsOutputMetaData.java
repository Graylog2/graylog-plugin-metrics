package org.graylog.outputs.metrics;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class MetricsOutputMetaData implements PluginMetaData {
    @Override
    public String getUniqueId() {
        return "org.graylog.outputs.metrics.MetricsOutputPlugin";
    }

    @Override
    public String getName() {
        return "MetricsOutput";
    }

    @Override
    public String getAuthor() {
        return "Graylog, Inc.";
    }

    @Override
    public URI getURL() {
        return URI.create("https://www.graylog.org/");
    }

    @Override
    public Version getVersion() {
        return new Version(1, 1, 3);
    }

    @Override
    public String getDescription() {
        return "Forwards selected field values of your messages to Graphite/Ganglia/InfluxDB.";
    }

    @Override
    public Version getRequiredVersion() {
        return new Version(1, 0, 0);
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
