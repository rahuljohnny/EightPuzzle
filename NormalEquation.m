function [theta] =normalEquation(X, y)
theta = zeros(size(X, 2), 1);

theta = pinv(X' * X) * X' * y;%pinv (x) =inverting a matrix,puts the result in theta
end
