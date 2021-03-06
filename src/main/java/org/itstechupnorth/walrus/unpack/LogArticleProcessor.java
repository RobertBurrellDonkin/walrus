/*
 *  Copyright 2010-2013 Robert Burrell Donkin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.itstechupnorth.walrus.unpack;

import org.itstechupnorth.walrus.base.ArticleBuffer;
import org.itstechupnorth.walrus.base.ArticleProcessor;

public class LogArticleProcessor extends ArticleProcessor {

    @Override
    public ArticleBuffer process(ArticleBuffer buffer) throws Exception {
        buffer.logTo(System.out);
        return buffer;
    }

    @Override
    public void close() throws Exception {
    }
}
