/*
 * Copyright 2017 Rover12421 <rover12421@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rover12421.shaka.cli.smali;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameters;
import org.jf.util.jcommander.ExtendedParameters;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Created by rover12421 on 06/06/2017.
 */
@Parameters(commandDescription = "Assembles smali files into a dex file.")
@ExtendedParameters(
        commandName = "assemble",
        commandAliases = { "ass", "as", "a", "smali", "s" })
public class AssembleCommand extends org.jf.smali.AssembleCommand {
    public AssembleCommand(@Nonnull List<JCommander> commandAncestors) {
        super(commandAncestors);
    }
}
