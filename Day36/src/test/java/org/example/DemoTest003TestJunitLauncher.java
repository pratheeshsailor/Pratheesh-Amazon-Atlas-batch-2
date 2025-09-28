package org.example;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;


import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class DemoTest003TestJunitLauncher {

    public static void main(String[] args) {
        // Create a listener to collect test results
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        // Build a discovery request for the specific test class
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(DemoTest002TestJunitAssertions.class))
                .build();

        // Create a launcher and register the listener
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);

        // Execute the tests
        launcher.execute(request);

        // Print summary
        TestExecutionSummary summary = listener.getSummary();
        System.out.println("Total tests found: " + summary.getTestsFoundCount());
        System.out.println("Tests succeeded: " + summary.getTestsSucceededCount());
        System.out.println("Tests failed: " + summary.getTestsFailedCount());
        System.out.println("Tests skipped: " + summary.getTestsSkippedCount());
    }
}
