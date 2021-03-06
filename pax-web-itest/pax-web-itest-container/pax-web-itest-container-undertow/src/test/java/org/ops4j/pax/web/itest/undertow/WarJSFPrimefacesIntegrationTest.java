/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.itest.undertow;

import static org.ops4j.pax.exam.CoreOptions.mavenBundle;
import static org.ops4j.pax.exam.MavenUtils.asInProject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.OptionUtils;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.web.itest.base.TestConfiguration;
import org.ops4j.pax.web.itest.common.AbstractWarJSFPrimefacesIntegrationTest;

/**
 * @author Achim Nierbeck
 */
@RunWith(PaxExam.class)
public class WarJSFPrimefacesIntegrationTest extends AbstractWarJSFPrimefacesIntegrationTest {

	@Configuration
	public static Option[] configure() {
		return OptionUtils
				.combine(
						configureUndertow(),
						TestConfiguration.jsfBundlesWithDependencies(),
						mavenBundle().groupId("org.primefaces").artifactId("primefaces").version(asInProject())
				);
	}

    @Test
    @Ignore
    public void testJSF() throws Exception {
        super.testJSF();
    }

    @Test
    @Ignore("what is wrong with the panelGrid?")
    public void testPrimefacesTagRendering() throws Exception {
        super.testPrimefacesTagRendering();
    }
}
