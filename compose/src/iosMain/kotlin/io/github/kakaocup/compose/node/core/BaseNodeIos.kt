package io.github.kakaocup.compose.node.core

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.builder.NodeMatcher

@PublishedApi
internal actual inline fun <reified N> createChildNode(
    semanticsProvider: SemanticsNodeInteractionsProvider,
    nodeMatcher: NodeMatcher,
    parentNode: BaseNode<*>,
): N = throw UnsupportedOperationException(
    "Reflection-based BaseNode.child<N> is not supported on iOS. " +
        "Construct child nodes directly, e.g. KNode(provider, viewBuilderAction)."
)
