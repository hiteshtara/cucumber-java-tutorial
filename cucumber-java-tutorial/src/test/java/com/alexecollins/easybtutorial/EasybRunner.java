package com.alexecollins.easybtutorial;

import org.easyb.BehaviorRunner;
import org.easyb.Configuration;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 */
public class EasybRunner extends Suite {

    public EasybRunner(Class<?> klass) throws InitializationError {
        super(klass, findRunners());
    }

    private static List<Runner> findRunners() {
        final List<Runner> runners = new ArrayList<Runner>();
        for (final File file : findStories()) {
            runners.add(new Runner() {
                @Override
                public Description getDescription() {
                    return Description.createSuiteDescription(file.getName().replaceAll("\\..*$", ""));
                }

                @Override
                public void run(RunNotifier notifier) {
                    notifier.fireTestStarted(getDescription());
                    try {
                        if (!new BehaviorRunner(new Configuration()).runBehaviors(BehaviorRunner.getBehaviors(new String[]{file.getPath()}))) {
                            notifier.fireTestFailure(new Failure(getDescription(), null));
                        }
                    } catch (Exception e) {
                        notifier.fireTestFailure(new Failure(getDescription(), e));
                    } finally {
                        notifier.fireTestFinished(getDescription());
                    }
                }
            });
        }

        return runners;
    }

    private static Set<File> findStories() {
        final Set<File> stories = new TreeSet<File>();
        findStories(new File("src/test/easyb"), stories);
        return stories;
    }

    private static void findStories(File dir, Set<File> stories) {
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                stories.add(file);
            } else {
                findStories(file, stories);
            }
        }
    }
}
