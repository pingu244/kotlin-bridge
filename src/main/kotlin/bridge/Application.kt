package bridge

fun main() {
    OutputView().printStartMessage()
    OutputView().printAskBridgeSize()
    val size = InputView().readBridgeSize()
    val bridge = BridgeMaker(BridgeRandomNumberGenerator()).makeBridge(size)
    OutputView().printMoveMessage()
    val moveDirection = InputView().readMoving()

}
